/*
 * SonarQube
 * Copyright (C) 2009-2024 SonarSource SA
 * mailto:info AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

import { FishVisual, Highlight } from '~design-system';
import { translate } from '../../helpers/l10n';

export default function EmptySearch() {
  return (
    <div aria-live="assertive" className="sw-text-center sw-py-8">
      <FishVisual />
      <Highlight as="h3" className="sw-typo-lg-semibold sw-mt-6">
        {translate('no_results_search')}
      </Highlight>
      <p className="sw-typo-default sw-mt-2">{translate('no_results_search.2')}</p>
    </div>
  );
}
